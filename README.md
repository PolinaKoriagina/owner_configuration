### Configuration for WEB tests

#### run tests with terminal commands

remote 
```bash
gradle clean -DremoteWebDriver=true -Dbrowser=chrome test 

```

local 
```bash
gradle clean -DremoteWebDriver=false -Dbrowser=chrome test   

```