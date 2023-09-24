/*
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

*/

def call (String aws_acc_id, String region, String ecr_name_repo){

    sh """
     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com
     docker push ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/${ecr_name_repo}:latest

    """

}