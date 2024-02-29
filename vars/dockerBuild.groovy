def call(String project, String ImageTag, String hubUser){
    
    sh """
     ls -l /var/run/docker.sock
     docker image build -t ${hubUser}/${project}:latest .
     ls -l /var/run/docker.sock
    """
}

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      docker build -t ${ecr_repoName} .
//      docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }
