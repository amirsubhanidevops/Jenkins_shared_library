def call (String project, String Imagetag, String hubUser){
    withCredentials([usernamePassword(
        credentialsId: 'docker', 
        passwordVariable: 'PASS', 
        usernameVariable: 'USER')]) 
    
    {
        sh "docker login -u '$USER' -p '$PASS' "
    }

    sh "docker image push ${hubUser}/${project}:${Imagetag}"
    sh "docker image push ${hubUser}/${project}:latest" 
}