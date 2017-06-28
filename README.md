# Lab05: Generics

The goal of this laboratory exercise is to learn more about the workflow involving IntelliJ for code editing, run environments and Git/GitHub for version control. Additionally, this lab also includes the concept of functions.

## Step 1. Cloning this laboratory

First, we need to get this project onto your computer. We do this using the `git clone` command. In the Terminal app type the following command

```bash
git clone https://github.com/groovy-training-logicmonitor/lab02
```

This command creates a copy of all the files in this project onto your computer. Once this operation is complete, we can then move onto opening the project in IntelliJ. First, go to IntelliJ and go to the Welcome screen by either launching the app or closing all project windows. Next, select *Checkout from Version Control*. In the dropdown, select *GitHub* and select *Password* in the *Auth Type* drop down menu. Enter your login and password credentials using the GitHub user account you gave me at the beginning of this training. Once you have logged in, copy the above URL into the *Git Repository URL* field. Then click *Clone*. You should now have the project cloned to your computer and opened in IntelliJ. You can skip to **Step 3** if you used this alternative method.

**Alternative** If you wish, you can also clone this project using IntelliJ.

## Step 2. I Like repeating jokes

I skipped step 2 last time. Rather than admit I was wrong, I chose to embrace the mistake and continue the tradition.

## Step 3. Opening the project in IntelliJ

Opening the project is simple. Select *Open* from the Welcome screen. Next, navigate to the location of the project on your computer and select the directory *lab02*. This should open the project in IntelliJ and you should be ready to run it.

## Step 4. Writing functions

Your assignment, should you chose to accept it, is to write four functions. Each function returns a new collection with different criteria for inclusion. The code is almost exactly the same for each. Keep the acronym DRY (Don't Repeat Yourself) in mind while you're writing these functions.

### `collect`

This function is simple. It takes two arguments, a collection (think list, or map), and returns a list (as a Collection) of only the ones that are equal to the other argument to this function `filter`.

The signature for this function is:

```java
public <E> Collection<E> collect(Collection<E> collection, E filter)
```

Here `E` is the parameterized type, it's what varies based on teh type of collection we pass in. `collection` is a `Collection` of some common type of values. It's the input that we are goign to collect from in this method. `filter` is the object we will use to filter. Each object equal to it will be included in the returned `Collection`

### `filter`

This function is almost the same as `collect`, however instead of those equal to filter it returns objects not equal to `filter`

### `filterGreaterThan`

This function is only slightly differnt from `filter`. It returns only those objects in `collection` that are greater than, in whatever way makes sense for `E`, than `filter`. 

One major difference in this method is that there is a constraint on `E`. The method declaration states that `E` must be a class that immplents the `Comparable` interface (i.e. it must have a method called `compareTo`). See this [document](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) for more information on what `compareTo` does and what it returns. 

### `filterLessThan'

This function is almost exactly the same as 'filterGreaterThan'. It only differs in that it filters out values that are less than `filter`.
### Extra street cred (optional)

Remembering back to what I said about DRY. Where in this code did you repeat yourself? This part is optional, but if you can come up with a way to even remove the repetition in each of these functions by writing a function that these functions call, you will forever be remembered as a true geek.

## Step 5. Committing the code (Optional)

If you want to commit the code, go for it. You know how to do it and don't need my help.
