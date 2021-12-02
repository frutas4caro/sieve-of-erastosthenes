pipeline{
	agent { dockerfile true }
	stages {
        stage('Build') {
            steps {
                sh 'docker build -t my-test-app .'
            }
        }
        stage('Run') {
            steps {
                sh 'docker run my-test-app'
            }
        }
    }
}       


