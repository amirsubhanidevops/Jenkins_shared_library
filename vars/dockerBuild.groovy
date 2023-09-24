def call (String project, String Imagetag, String hubUser){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${Imagetag}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest 

    """
}