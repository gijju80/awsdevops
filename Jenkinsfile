pipeline {
    agent any

    stages {
        stage('Git-checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gijju80/awsdevops.git']])
            }
        }
        
  stage('Build') {
            steps {
                echo "Bild is success"
                
                
            }
        }
    }
}
