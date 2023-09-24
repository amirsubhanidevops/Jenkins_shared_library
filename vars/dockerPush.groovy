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
     aws ecr get-login-password --region ${region} | docker login --username AWS -p eyJwYXlsb2FkIjoieks3TFZTNVRkMks2R0lWeEsxdHQ1N0doOHorSFE4SXdSRFJJaHVKWnFjM25lR2RSYTVNVUkvdWY3Y2x4a0w0OW96aEZySFg2NEFham5yNFRiL0dyOXZGdzJPMVdpa2ZVa0d6bXVGNGM2Y21salRyOE5oNjV5RFRHNUoxN092eEFiYXlsZTlwdWg4eUZ4b1haQnJoUlh1VTZrWUl2OUlrQVlkN1pkS2JnYlVXeHRlZExHY2dFQml3M0pFcncwMXFxb0pQMzVTZmFwRURuclNOQXNuRzlLK3B6Y0xDaVAreE1Yc2dpVzh6RW5FWDdYdDBSSG5BL1pTUzRKempUaGJvbG1rTGxqRTF1MG4wcnl3Y2VLL0hXWCtsQkg5T0ZFVEhrQ1B6TUY4bXVjYSsxUHduc1dtSHJZVk1EMU5WSDVjM2p5SDZhSmxHUzZQRUMxNGQ1MXVKNmVUVHRLaVhPRjNWUXA4dGRNcG5nTHRRMVdrOFgxZHo2S0dpS2MzRGdYQ1lQL3FaQkozd1M3RFRacFlDeUVUc083UkI5ZlQ3a2k2ZndBVnZIZXBjL3NpMTlRNnBxb01rK29vd0IyVWROVGNMY1d5U2VwYUp3SFN4b3ZPK3dGaGxZNlpzYzFGNVpGcW12OEl2TVREbmFxSEdad2hNUjRNOEVWWjhieDBvVXVTaGU4ZlZRYXU1cGxiRWlQcng4RFlSU2wxRW9zWHJaQjlheHNTK0pHMGRGN0JiaDlzdXdJT0RjZC9xcWlSVGxYTlR2aDViVVRwY0pwM1RybExxMDRkYkpHcllmZ2RLanJQVWgvejlhYXQydWlRSnA5MHV6c2NnZ3lmdGg0QXdOWFVMSFhlRkh4aUFsR1VzcUEyWjV2dkhiYko1cGN6VVRzamJVUmtYajJzRWVkek9ycXZ3SGJHUGxZaWszc2JpZlJubXdLUWdwUExrOE9EcHhZVXVmeWJyUnpQTGRVaVM1ZkpKam9hR1JWdXhjYUFoMXBSZWxQSDhYQ1RoU2wwUERoVk52aTBtTERnZGdPaVg5d09QcWs5SzZja3RKdlNHYVFJY2psQjBEbnUvMGV0RWhyc1JhYjV1K25ZTzFrOWRPV0R1T29YUTI3K3BLdWFucjIrL0tFRGVIWERiTnNpTmxTMG9zbXJtTVFQamN2SUtWa0FvVjZ2dmpkZ0wrVGNiOEZQNitZc2h0ZU1Ud1k3T29tOTRWVGhqL2ZQZXJNYTEyTWNpN3NFVlNxNTZkZm9BdjhYV3V0NjlFZjcySHB2UzJmczFWcHNvSEdOWjVYVGVpcldjc2RXQzlZbTNnZm4yWW51R3VsOTRrSXdITzlBZENmV1hXa0VPeXRVZDYxcU1PRS9zOTJTc0NyQnlmcWVNQUVUYjl5UT09IiwiZGF0YWtleSI6IkFRRUJBSGh3bTBZYUlTSmVSdEptNW4xRzZ1cWVla1h1b1hYUGU1VUZjZTlScTgvMTR3QUFBSDR3ZkFZSktvWklodmNOQVFjR29HOHdiUUlCQURCb0Jna3Foa2lHOXcwQkJ3RXdIZ1lKWUlaSUFXVURCQUV1TUJFRURCaWZxb0NXK0NqMytXbFN3Z0lCRUlBN0RxWE9zd1ltNUd4N2U1L3NpTUxvalM3ZjhHWS9oNVROVGxLNnh1OC9ZVy84NDFnNU14Tm56YytnSkxoWnVaeW0zVjhwcytzZEhWSFNGeE09IiwidmVyc2lvbiI6IjIiLCJ0eXBlIjoiREFUQV9LRVkiLCJleHBpcmF0aW9uIjoxNjk1NTk0NTY1fQ== -e none https://793555027847.dkr.ecr.us-east-1.amazonaws.com ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/amirsubhani
     docker push ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/${ecr_name_repo}:latest

    """

}