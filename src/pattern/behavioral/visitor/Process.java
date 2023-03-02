package pattern.behavioral.visitor;

public class Process implements Construction{
    Construction[] construction;
    public Process(){
        this.construction= new Construction[]{
          new Foundation(),
          new Roof(),
          new Wall(),
        };
    }
    @Override
    public void success(Visitor visitor) {
        for(Construction elem:construction){
            elem.success(visitor);
        }
    }
}
