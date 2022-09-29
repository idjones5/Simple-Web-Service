# Summative-1-Jones-Imani

# Overview
<hr>
<p> 
    This project is a simple REST web service that provides a quote-of-the-day, 
    word-of-the-day, and magic 8 ball service. 
</p>

<p> 
    Here is a <a href="https://drive.google.com/file/d/1Rez_fkMXv7rk_L9OvXijTh1af0KdoWEs/view?usp=sharing">
    link to a video</a> explaining this web service. 
</p>


# APIs
<hr>

## Random Quote Service 
## Features

<p>
    Returns a random quote along with its author upon request.
</p>

<p>
    Quote API Request:
    
    URI: /quote
    
    Method: GET
    
    Request Body: None
    
    Response Body: Quote
</p>

<p>
    Quote API Response:

    { 
        "quote": "Foo",
        "author": "Foo",
        id: 1
    }

</p>

## Random Definition Service

## Features

<p>
    Returns a random word and definition upon request.
</p>

<p>
    Word API Request:

    URI: /word
    
    Method: GET
    
    Request Body: None
    
    Response Body: Definition
</p>

<p>
    Definition API Response:

    { 
        "word": "Foo",
        "definition": "Foo",
        id: 1
    }

</p>

## Magic 8 Ball Service

## Features

<p>
    Returns a random response to a question along with the question asked. Request body can be null.
</p>

<p>
    Magic 8 Ball API Request:

    URI: /magic
    
    Method: POST
    
    Request Body: Question
    
    Response Body: Answer
</p>

<p>
    Quote API Response:

    { 
        "question": "Foo",
        "answer": "Foo",
        id: 1
    }

</p>