pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }

    stages {
        stage('Build Maven') {
            steps {
               sh "mvn clean install"
            }
        }

    }
}
