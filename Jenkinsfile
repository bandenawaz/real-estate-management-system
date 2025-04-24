pipeline {
    agent any

    environment {
        MAVEN_HOME = '/opt/homebrew/bin' // Adjust if necessary
        PATH = "${MAVEN_HOME}:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout from the 'main' branch
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/bandenawaz/real-estate-management-system.git']]
                ])
                echo 'Checkout completed successfully'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn --version' // Confirm Maven is available
                sh 'mvn clean package'
                echo 'Build completed successfully'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
                echo 'Tests completed successfully'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn spring-boot:run'
                echo 'Deployment completed successfully'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully'
        }

        failure {
            echo 'Pipeline failed'
        }
    }
}
