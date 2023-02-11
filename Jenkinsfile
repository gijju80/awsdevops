pipeline {
    agent any
    
    environment {
        
     MAIN_BRANCH_NAME = 'main'   
      DEV_BRANCH_NAME = 'DEV'
    }

    stages {
        stage('Git-checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gijju80/awsdevops.git']])
                echo env.MAIN_BRANCH_NAME
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
       steps {
           script {
               if (MAIN_BRANCH_NAME == 'main') {
                   echo env.MAIN_BRANCH_NAME
                   echo 'Deploying to Prod'
               }
               else {
                   echo "It's Dev Branch"
               }
                  
           }
       }
   }
    }
}
          
      
