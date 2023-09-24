def call (String project, String Imagetag, String hubUser){
    sh """
        docker rmi ${hubUser}/${project} ${hubUser}/${project}:${Imagetag}
        docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest 

    """
}