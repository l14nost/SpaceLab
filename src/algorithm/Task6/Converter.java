package algorithm.Task6;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter{
    public static String toJSON(Object o){
        Field[] fields = o.getClass().getDeclaredFields();
        StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getSimpleName());
        sb.append("{\n");

        for( int i = 0; i<fields.length;i++){
            String nameField = fields[i].getName();
            fields[i].setAccessible(true);
            Object value;
            try {
                value = fields[i].get(o);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            if(value instanceof String){
                sb.append(nameField).append(":").append("\"").append(value).append("\"").append(",");
            }
            else if(value.getClass().isArray()){
                sb.append(nameField);
                sb.append("[");
                if(value instanceof String){
                    sb.append(":").append("\"").append(new ArrayList<>().addAll(List.of((Object[]) value))).append("\"").append(",");
                }
                else {
                    sb.append(":").append(value).append(",");
                }
                sb.append("]");
            }

            else if(value instanceof Number||value instanceof Boolean){
                sb.append(nameField).append(":").append(value).append(",");
            }
            else{
                sb.append(Converter.toJSON(value));
                sb.deleteCharAt(sb.length()-3);

            }
            sb.append("\n");

        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("\n}");
        return sb.toString();

    }



}
