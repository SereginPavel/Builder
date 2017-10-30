def props = [:]
def rfcList = []
load groovyx.gpars.GParsPool;
//

if(env.AdditionalRFC != null){
    rfcList = env.AdditionalRFC.tokenize(';')
    println("rfcLost: " + rfcList)
}

if (env.JobName != null) props.put('JobName', env.JobName)
node {
    def workspace = pwd();
    println workspace
    def task =[];
    workspace = 'C:\\Program Files (x86)\\Jenkins\\workspace\\Init_build@script'
    def build = load "$workspace\\src\\Builder.groovy"
    timestamps{
        ansiColor('xterm'){
            stage('build'){
                for (def rfc : rfcList){
                    if (props.JobName){
                        GParsPool.withPool (100 ,{
                            task.eachParallel { x ->
                                build job: 'pipeline-jenkins-example', wait: true
                            }
                        })
                       //new Thread(build).start();
                    }
                }
            }
        }
    }
}