GitHub Branching

A branch is a separate line of development in Git.

Default branch:

main

Create a new branch:

git branch feature-login

Switch to branch:

git checkout feature-login

Create + switch:

git checkout -b feature-login
Example
main
 └── feature-login

Developer works on feature-login without affecting main.

Branch Management

Branch management means organizing and maintaining branches properly.

Common Branch Types
main        → stable production code
develop     → testing/integration
feature/*   → new features
bugfix/*    → bug fixes
hotfix/*    → urgent production fixes
Example
main
 └── develop
      ├── feature-payment
      ├── feature-search
      └── bugfix-navbar
Best Practices
Keep branches short-lived
Use meaningful names
Delete merged branches
Pull latest changes frequently

Delete branch:

git branch -d feature-login

Delete remote branch:

git push origin --delete feature-login
Merge Operations

Merging combines changes from one branch into another.

Fast Forward Merge
Before Merge
main
A---B

feature
     C---D

Merge:

git checkout main
git merge feature
After Merge
A---B---C---D

No merge commit created.

Three-Way Merge

When both branches changed.

Before
      C---D feature
     /
A---B---E main
After
      C---D
     /     \
A---B---E---M

M = merge commit

Squash Merge

Combines all commits into one.

git merge --squash feature-login

Useful for clean history.

Merge Conflict Resolution

A conflict occurs when same file/line is modified differently in two branches.

Example Conflict
main branch
print("Hello Main")
feature branch
print("Hello Feature")

Merge:

git merge feature

Conflict appears:

<<<<<<< HEAD
print("Hello Main")
=======
print("Hello Feature")
>>>>>>> feature
Resolving Conflict

Edit file manually:

print("Hello Main")
print("Hello Feature")

Then:

git add .
git commit

Conflict resolved.

Useful Commands
Purpose	Command
Create branch	git branch name
Switch branch	git checkout name
Create + switch	git checkout -b name
Merge branch	git merge branch
Rebase	git rebase main
Delete branch	git branch -d name
Check conflicts	git status
