pipeline {
    agent any
    
    environment {
        
     MAIN_BRANCH_NAME = 'main'   
    }

    stages {
        stage('Git-checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gijju80/awsdevops.git']])
                echo $MAIN_BRANCH_NAME
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
        
   stage('Deploy') {
      
    
         if(MAIN_BRANCH_NAME == 'main'){
             steps {
      echo 'Deploy prod'
    }
    }
  }
    }
}
