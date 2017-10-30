/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable, Runnable{
    def a = 4;
    def b = 7;
    def c;
    void run(){
        c = a+b
        println(c)
    }
}
return new OneBuild()

