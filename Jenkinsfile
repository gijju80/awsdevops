pipeline {
    agent any

    stages {
        stage('Git-checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gijju80/awsdevops.git']])
                echo $BRANCH_NAME
            }
        }
        
  stage('Build') {
            steps {
                echo "Build is success"
                
                
            }
        }
        
  stage('Test') {
            steps {
                echo "Test is success"
                
                
            }
        }
        
   stage('Test') {
       if ($BRANCH_NAME == 'main') {
            steps {
                echo "Deplot in Prod"
                
                
            }
        }
    }
}
