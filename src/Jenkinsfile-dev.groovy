def props = [:]
def rfcList = []

//

if(env.AdditionalRFC != null){
    rfcList = env.AdditionalRFC.tokenize(';')
    println("rfcLost: " + rfcList)
}

if (env.JobName != null) props.put('JobName', env.JobName)
node {
    def workspace = pwd();
    println workspace
    workspace = 'C:\\Program Files (x86)\\Jenkins\\workspace\\Init_build@script'
    final build = load "$workspace\\src\\Builder.groovy"
    timestamps{
        ansiColor('xterm'){
            stage('build'){
                for (def rfc : rfcList){
                    if (props.JobName){
                        //build job: "$props.JobName", wait: true
                        println 'hello'
                        build.run();
                    }
                }
            }
        }
    }
}