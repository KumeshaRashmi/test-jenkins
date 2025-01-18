pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'main', url: 'https://github.com/KumeshaRashmi/test-jenkins'
            }
        }
        stage('Run Python Script') {
            steps {
                // Run the Python script
                sh 'python3 hello_world.py'
            }
        }
    }
}
