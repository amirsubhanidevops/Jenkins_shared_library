def call(Map stageParams){
    checkout(
        [
        $class: 'GirSCM'
        branches: [[name: stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
        ]
    )
}