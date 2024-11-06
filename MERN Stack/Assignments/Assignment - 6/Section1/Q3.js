const book = {
    title: "2 States",
    author: "Chetan Bhagat",
    year: 2012,

    displayDetails() {
        console.log("Title: " + this.title + " \nAuthor: " + this.author
            + " \nYear of Publishment: " + this.year
        );
    }
};

book.displayDetails();