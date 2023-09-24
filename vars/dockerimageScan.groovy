/*
def call (String project, String Imagetag, String hubUser){
    sh """
        trivy image ${hubUser}/${project}:latest > scan.txt
        cat scan.txt 

    """
}

*/

def call (String aws_acc_id, String region, String ecr_name_repo){

    sh """
     trivy image ${ecr_name_repo}:latest ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/${ecr_name_repo}:latest > scan.txt
     cat scan.txt
    """

}
