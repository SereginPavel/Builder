def props = [:]
def rfcList = []
//

if(env.AdditionalRFC != null){
    rfcList = env.AdditionalRFC.tokenize(';')
    println("rfcLost: " + rfcList)
}

if (env.JobName != null) props.put('JobName', env.JobName)
node {
    def build;
    def parent = getClass().getClassLoader()
    def loader = new GroovyClassLoader(parent)
    def workspace = 'C:\\Program Files (x86)\\Jenkins\\workspace\\Init_build@script'
    build = loader.parseClass(new File("$workspace\\src\\Build.groovy")).newInstance()

    //def build = load "$workspace\\src\\Builder.groovy"
    timestamps{
        ansiColor('xterm'){
            stage('build'){
                for (def rfc : rfcList){
                    build.runTest();
                }

            }
        }
    }
}