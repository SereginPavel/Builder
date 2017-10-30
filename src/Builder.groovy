/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild extends Thread implements Serializable{
    def a = 4;
    def b = 7;
    def c
    @Override
    run(){
        c = a+b
        println(c)
    }
}
return new OneBuild()

