def call (String project, String Imagetag, String hubUser){
    sh """
        trivy image ${hubUser}/${project} ${hubUser}/${project}:latest > scan.txt
        can scan.txt 

    """
}