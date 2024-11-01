pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}



	stages {

		stage('Build'){
			tools {
        		jdk 'java-17'
        	}
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			tools {
        		jdk 'java-17'
        	}
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			tools {
        		jdk 'java-17'
        	}
			steps {
			    bat "mvn jar:jar deploy:deploy"
			}
		}
	}
}