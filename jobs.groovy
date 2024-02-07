job('job1') {
  steps {
    shell('echo Hello World from job dsl git!')
  }
}
job('job2') {
  steps {
    shell('echo Hello Shankar from job dsl git!')
  }
}
