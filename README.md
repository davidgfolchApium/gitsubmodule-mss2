# git-submodules - Git submodules article example

In this article I'm going to explain how to use git submodules with an example.

## Initial setup

### From scratch

Steps to set up blank projects with a common git submodule:
- First, Git repositories should be created for all projects and submodules.
- I created repositories for 
  [mss1](https://github.com/davidgfolchApium/gitsubmodule-mss1), 
  [mss2](https://github.com/davidgfolchApium/gitsubmodule-mss2) and 
  [apiClient](https://github.com/davidgfolchApium/gitsubmodule-apiclient).
- Cloned mss1 and mss2 repositories and add apiClient submodule in each:

        git submodule init
        git submodule add -b master https://github.com/davidgfolchApium/gitsubmodule-apiclient

### Git clone from example

Once we have the git repositories created and linked with the submodule, we can just clone the parent repository this way:

    git clone --recurse-submodules https://github.com/davidgfolchApium/gitsubmodule-mss1
    git clone --recurse-submodules https://github.com/davidgfolchApium/gitsubmodule-mss2
