def call (String project, String Imagetag, String hubUser){
    sh """
        trivy image ${hubUser}/${project}:latest > scan.txt
        cat scan.txt 

    """
}