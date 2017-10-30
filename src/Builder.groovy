/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable{
    def name = 'tester'
    def a = 4;
    def b = 7;
    public def run(){
        return a+b;
    }

    static def test(){
        println 'hello world'
    }
}
return new OneBuild()

