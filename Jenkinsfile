pipeline {
  agent any
  
  stages {
    stage('init') {
      steps {
        script {
          echo 'Hello World!'
        }
      }
    }
    stage('next') {
      steps {
        script {
          echo 'Hello Shankar!'
        }
      }
    }
    stage('read file') {
      steps {
        script {
          def fileContent = readFile 'example.txt'
          echo "File content: ${fileContent}"
        }
      }
    }
    stage('execute job dsl script') {
      steps {
        script {
          def jobDSLScript = readFile 'jobs.groovy'
          jobDsl scriptText: jobDSLScript
        }
      }
    }
  }
}
