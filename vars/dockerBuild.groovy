/*
def call (String project, String Imagetag, String hubUser){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${Imagetag}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest 

    """
}

*/

def call (String aws_acc_id, String region, String ecr_name_repo){

    sh """
     docker build -t ${ecr_name_repo} .
     docker tag ${ecr_name_repo}:latest ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/${ecr_name_repo}:latest

    """

}