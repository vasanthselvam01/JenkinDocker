pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }


    stages {
        stage('Initialize') {
            steps {
               sh "echo hello"
               echo 'Pulling... ' + env.GIT_BRANCH.split("\\*/")[1]
            }
        }

        stage('Build Maven') {
            when {
                expression { env.GIT_BRANCH == 'develop' }
            }
            steps {
               sh "mvn clean"
            }
        }
    }

}
