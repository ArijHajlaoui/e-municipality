pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
        agent {
         docker {
            image 'maven:3-alpine'
          }
         } 
        }
        stage('Test'){
            steps {
                sh 'mvn --version'
            }
        }
        stage('Deploy') {
            steps {
                sh 'pwd'
            }
        }
    }
}
