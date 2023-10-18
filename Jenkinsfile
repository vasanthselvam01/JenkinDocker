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

        stage('Build Maven') {
            steps {
               sh "mvn clean"
            }
        }
    }

}
