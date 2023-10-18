pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }

    stages {
            stage('Initialize') {
                steps {
                   sh "echo hello"
                }
            }
        }

    stages {
        stage('Build Maven') {
            steps {
               sh "mvn clean"
            }
        }
    }

}
