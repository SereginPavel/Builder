def props = [:]
def rfcList = []
//def build = load 'src/lib/OneBuild.groovy'

if(env.AdditionalRFC != null){
    rfcList = env.AdditionalRFC.tokenize(';')
    println("rfcLost: " + rfcList)
}

if (env.JobName != null) props.put('JobName', env.JobName)
node {
    timestamps{
        ansiColor('xterm'){
            stage('build'){
                for (def rfc : rfcList){
                    if (props.JobName){
                        //build job: "$props.JobName", wait: true
                        println 'hello'
                      //  build.run();
                    }
                }
            }
        }
    }
}