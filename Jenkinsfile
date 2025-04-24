pipeline {
    agent any
    tools {
        maven 'mvn'
        jdk 'jdk'

    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
                git url: 'https://github.com/bandenawaz/real-estate-management-system.git'
                echo 'Checkout completed successfully'
            }
        }

        stage('Build') {
            steps {
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
            echo 'Pipeline completed'
        }

        failure {
            echo 'Pipeline failed'
        }
    }
}