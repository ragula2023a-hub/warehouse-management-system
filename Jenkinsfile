pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/ragula2023a-hub/warehouse-management-system.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t warehouse-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8082:8080 warehouse-app'
            }
        }

    }
}