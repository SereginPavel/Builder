/**
 * Created by SerP on 30.10.2017.
 */
class OneBuild implements Serializable{
    def name = 'tester'
    public def run(){
        println 'hello!!!';
    }

    static def test(){
        println 'hello world'
    }
}
return new OneBuild()

