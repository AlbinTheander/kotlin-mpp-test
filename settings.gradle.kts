rootProject.name = "mpp-test"
include("libs:utils")
findProject(":libs:utils")?.name = "utils"
include("libs:main")
findProject(":libs:main")?.name = "main"
