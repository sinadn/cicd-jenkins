pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

//   tools {
//         // Use Java 8 for the build
//          jdk 'openjdk11'
//     }

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn jar:jar deploy:deploy"
			}
		}
	}
}