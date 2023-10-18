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
            when {
                expression { env.GIT_BRANCH == 'develop1' }
            }
            steps {
               sh "mvn clean"
            }
        }
    }

}
