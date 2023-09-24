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
     aws ecr get-login-password --region ${region} | docker login -u AWS -p eyJwYXlsb2FkIjoiS0JFS2hHU0xXZm52UlJ4RlViSFRhRm1YTXptakhnVmlWTGlZbHhsdEZSRmFidTRFZ0ZkZm14VWhuVUQ3R0ZjMEJLTExNVVJ1bytLZmlnQkZaakd1VkRlMXVhRldnS0NnaWNGN09wdWJNYW5QZ2kxSWovOHlpNCtFUktSYWpTMzBiUTJLbHp4ZkhudlBkT256SmVMc3pSMmYvYmtzNGsyOW9aU0ZWZ2owZm9hcXBzQmRvQndNbkd4Q284QUVFR1k2Vm1obmVZYnpDR0IzVnlGUUN1RElIN3h6ZE9tYXZGUllPVlZyWlZRWWFxalozSGVUSXp5cUw5c2NOS056TXAyN0llalE3SlVYTng1OEt2dDY5ZmsyYWJ2MDNKZTRoeDVqMlhBclZ0M0ZvaGdYUFg5WWEwenh2SFM0WlZUY2h1L3RMbzJJMWYvcUVpRXFQeUNhZHZGRjEwVUV6T3NyalJTbVhwTis2N1ZsMFFlN2h5bDkzakVpRytYZjdjWGloMkkvQ3BhQ2dSbzk1S1ZwSmFHU1VPSTdKcklNVERFUHBqajZhQVhLRmlhT05tcG9RQXhKbHdGTjNCNWd3WDRaaEgxbTJITTFZRWlEWXZ0djRBL3lIMFlab1pPblZ6ajI5TTJVa0Y1TGo4REw2RVI3UEo4U1ltOWxENUc0amRhenh5dU9BTjdXOWNadmFQcW5hOFJsTThqVk1xa080YnVld2VDS2dlWVQrdG1WaDZqMUZyc2xiWUo2OFR2V0ROVSsySlBvQjdGY3J4OFVVSkRuMXVaL3k1WHh2Vlo4NDlIcVpXVnR3QmJwcTB0Ry9EaC9pMzIybGlrUHFTVVhYMEdOVXgwdHFqc2VOcURKbmR6YUxKNVB0VEVnTXhDUndQV204ZXNOdnpqTHRXWmFCMzUzTkNiNjBJZEl0R2IvT0tIcGI4emxoek9vY3E4Y3cvaFNnenNXbHBnRkZ6V0hRYnd0RjNxSDk2cU41d3ZXa3ZTZG9LS2pzQTNxYnhZTy9PREFocHV5VVEyU21aQzRqRitUSlJRYzdDRTZSTklDaTFhaEY0SjkxbTVIZDZBYU9vdmlOejVONkZQNjlzZnNmV295cTMrYktIN1kxVnUxL3QwZXR6bi9jYmdQOXEzSlpDRzhPNGl1cVd3bGt6M2ZWTzJQeHhxN2NTVVZXbEg4T2t2cFFxd0JIa1Njcm9HOVhsTWc0U1BaQ2tVdDI0clVNV053Mnd3TkpoVUdwTEZwaUNuRzRMUWV2SGdxRFFTOEJkdlRqSXpCZXRXamJreFo1Q1ZFbml2cjJGM2tTVGhlNlR6UytaZ296eUVBNC9NbUNKelVuOCszTHJHSS82Qml5L09SNSs0VnVkT1hmMWl4Q3M5QmNPMlZidz09IiwiZGF0YWtleSI6IkFRRUJBSGh3bTBZYUlTSmVSdEptNW4xRzZ1cWVla1h1b1hYUGU1VUZjZTlScTgvMTR3QUFBSDR3ZkFZSktvWklodmNOQVFjR29HOHdiUUlCQURCb0Jna3Foa2lHOXcwQkJ3RXdIZ1lKWUlaSUFXVURCQUV1TUJFRUROM1JHRnJsQmtjRWVGU2Iyd0lCRUlBNzhDcGQ5clE3SEdDbTY5dnphUk4wY2hqck5yNzQyYkxpQ0M5dVZtWTRabHV6WGZxcEV1YXNVRjJlNzlNbjI0R2ZHK0tTcUJ5WlNRWlhvMms9IiwidmVyc2lvbiI6IjIiLCJ0eXBlIjoiREFUQV9LRVkiLCJleHBpcmF0aW9uIjoxNjk1NTk1NDY5fQ== 793555027847.dkr.ecr.us-east-1.amazonaws.com/amirsubhani
     docker push ${aws_acc_id}.dkr.ecr.${region}.amazonaws.com/${ecr_name_repo}:latest

    """

}