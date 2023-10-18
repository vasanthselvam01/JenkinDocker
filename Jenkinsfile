pipeline {
    agent any
    environment {
        DISABLE_AUTH = 'true'
       }
    tools {
        maven 'MAVEN'
    }


    stages {
        stage('Initialize') {
            steps {
               echo 'hello Jenkisnfile'
               echo 'Pulling... ' + env.GIT_BRANCH.split("/")[1]
               echo 'environment variable ' +env.DISABLE_AUTH
            }
        }

        stage('Build Maven') {
            when {
                expression { env.GIT_BRANCH.split("/")[1] == 'develop1' }
            }
            steps {
               sh "mvn clean"
            }
        }
    }

}
