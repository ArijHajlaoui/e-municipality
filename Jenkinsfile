pipeline { 
agent {
        docker {
            image 'maven:3-alpine'
        }
    }
    stages {
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
