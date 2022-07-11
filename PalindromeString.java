class PalindromeString{

   public static void main(String args[]){

         String s1="Good";
         String s2="Morning";
            
            s1=s1+s2;
           s2=s1.substring(0,s1.length()-s2.length());
            s1=s1.substring(s2.length());
               System.out.println(s2
admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop
$ mkdir Gitdemo

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop
$ cd Gitdemo

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo
$ git init
Initialized empty Git repository in C:/Users/admin/Desktop/Gitdemo/.git/

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git add PalindromeString
fatal: pathspec 'PalindromeString' did not match any files

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git add PalindromeString
fatal: pathspec 'PalindromeString' did not match any files

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git add PalindromeString.java

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git diff

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git diff
diff --git a/PalindromeString.java b/PalindromeString.java
index 732288f..9e24537 100644
--- a/PalindromeString.java
+++ b/PalindromeString.java
@@ -12,7 +12,7 @@ class PalindromeString{
                         break;
                      }
            }
-             if(c){
+             if(c==true){
                  System.out.print("P");
             }else{System.out.print("N P");}
   }

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git commit -a -m 'first change'
[master (root-commit) 6ac44e8] first change
 1 file changed, 20 insertions(+)
 create mode 100644 PalindromeString.java

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git remote add MyfirstApplication
usage: git remote add [<options>] <name> <url>

    -f, --fetch           fetch the remote branches
    --tags                import all tags and associated objects when fetching
                          or do not fetch any tag at all (--no-tags)
    -t, --track <branch>  branch(es) to track
    -m, --master <branch>
                          master branch
    --mirror[=(push|fetch)]
                          set up remote as a mirror to push to or fetch from


admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git remote add origin git remote add origin https://github.com/Ranjjdk/MyfirstApplication.git
usage: git remote add [<options>] <name> <url>

    -f, --fetch           fetch the remote branches
    --tags                import all tags and associated objects when fetching
                          or do not fetch any tag at all (--no-tags)
    -t, --track <branch>  branch(es) to track
    -m, --master <branch>
                          master branch
    --mirror[=(push|fetch)]
                          set up remote as a mirror to push to or fetch from


admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git branch -M main

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (main)
$ git push origin master
error: src refspec master does not match any
error: failed to push some refs to 'origin'

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (main)
$ git checkout master
error: pathspec 'master' did not match any file(s) known to git

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (main)
$ git checkout master
error: pathspec 'master' did not match any file(s) known to git

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (main)
$ git branch master

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (main)
$ git switch master
Switched to branch 'master'

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git push origin master
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git remote add origin https://github.com/Ranjjdk/MyfirstApplication.git

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git push origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 438 bytes | 146.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/Ranjjdk/MyfirstApplication.git
 * [new branch]      master -> master

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git diff
diff --git a/PalindromeString.java b/PalindromeString.java
index 9e24537..4449d4e 100644
--- a/PalindromeString.java
+++ b/PalindromeString.java
@@ -2,7 +2,7 @@ class PalindromeString{

    public static void main(String args[]){

-         String s="Ranjet";
+         String s="kayak";
           boolean c=true;
            for(int i=0;i<s.length()/2;i++){


admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git commit -PalindromeString.java -m  'first change'
error: unknown switch `P'
usage: git commit [<options>] [--] <pathspec>...

    -q, --quiet           suppress summary after successful commit
    -v, --verbose         show diff in commit message template

Commit message options
    -F, --file <file>     read message from file
    --author <author>     override author for commit
    --date <date>         override date for commit
    -m, --message <message>
                          commit message
    -c, --reedit-message <commit>
                          reuse and edit message from specified commit
    -C, --reuse-message <commit>
                          reuse message from specified commit
    --fixup [(amend|reword):]commit
                          use autosquash formatted message to fixup or amend/reword specified commit
    --squash <commit>     use autosquash formatted message to squash specified commit
    --reset-author        the commit is authored by me now (used with -C/-c/--amend)
    --trailer <trailer>   add custom trailer(s)
    -s, --signoff         add a Signed-off-by trailer
    -t, --template <file>
                          use specified template file
    -e, --edit            force edit of commit
    --cleanup <mode>      how to strip spaces and #comments from message
    --status              include status in commit message template
    -S, --gpg-sign[=<key-id>]
                          GPG sign commit

Commit contents options
    -a, --all             commit all changed files
    -i, --include         add specified files to index for commit
    --interactive         interactively add files
    -p, --patch           interactively add changes
    -o, --only            commit only specified files
    -n, --no-verify       bypass pre-commit and commit-msg hooks
    --dry-run             show what would be committed
    --short               show status concisely
    --branch              show branch information
    --ahead-behind        compute full ahead/behind values
    --porcelain           machine-readable output
    --long                show status in long format (default)
    -z, --null            terminate entries with NUL
    --amend               amend previous commit
    --no-post-rewrite     bypass post-rewrite hook
    -u, --untracked-files[=<mode>]
                          show untracked files, optional modes: all, normal, no. (Default: all)
    --pathspec-from-file <file>
                          read pathspec from file
    --pathspec-file-nul   with --pathspec-from-file, pathspec elements are separated with NUL character


admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git commit -a -m 'second change'
[master 1e6f523] second change
 1 file changed, 1 insertion(+), 1 deletion(-)

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git remote add origin https://github.com/Ranjjdk/MyfirstApplication.git
error: remote origin already exists.

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git diff

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ ^C

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$   git remote add origin https://github.com/Ranjjdk/MyfirstApplication.git
error: remote origin already exists.

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$   git remote add origin1 https://github.com/Ranjjdk/MyfirstApplication.git

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git push origin1 master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 290 bytes | 145.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Ranjjdk/MyfirstApplication.git
   6ac44e8..1e6f523  master -> master

admin@DESKTOP-1C4IMO6 MINGW64 ~/Desktop/Gitdemo (master)
$ git diff
diff --git a/PalindromeString.java b/PalindromeString.java
index 4449d4e..26a78b5 100644
--- a/PalindromeString.java
+++ b/PalindromeString.java
@@ -2,19 +2,16 @@ class PalindromeString{

    public static void main(String args[]){

-         String s="kayak";
-          boolean c=true;
-           for(int i=0;i<s.length()/2;i++){
-
-                      if(s.charAt(i)!=s.charAt(s.length()-1-i)){
-
-                        c=false;
-                        break;
-                     }
-           }
-             if(c==true){
-                 System.out.print("P");
-            }else{System.out.print("N P");}
+         String s1="Good";
+         String s2="Morning";
+
+            s1=s1+s2;
+           s2=s1.substring(0,s1.length()-s2.length());
+            s1=s1.substring(s2.length());
+               System.out.println(s1);
+                 System.out.print(s2);
+
+
   }

 }
  https://github.com/Ranjjdk/MyfirstApplication.git

         
         
  }

}