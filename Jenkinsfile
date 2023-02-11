pipeline {
    agent any
    
    

    stages {
        stage('Git-checkout') {
            steps {
                checkout scm
                echo env.BRANCH_NAME
            }
        }
        
  stage('Build') {
            steps {
                
                sh 'docker build -t MyDockerImage:v1'
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
               if (BRANCH_NAME == 'main') {
                   echo env.BRANCH_NAME
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
          
      
