# Flxtr
Flxtr is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [X] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [X] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [X] Trailers for popular movies are played automatically when the movie is selected (1 point).
  - [X] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [X] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [X] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [] Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
   - Began in a branch but didn't notice ButterKnife, master does not have this.
- [X] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

<img src='CP2.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

### Notes

Describe any challenges encountered while building the app.

## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## Flxtr Part 1

### User Stories
#### REQUIRED (10pts)
- [X] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [ ] (2pts) Views should be responsive for both landscape/portrait mode.
   - [X] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [ ] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.
          - Doesn't change the image used

### App Walkthough GIF
<img src='CodepathUnit1.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
Imgur link: https://imgur.com/a/5Vn2KlF 


### Notes
Didn't get the time this week to do as much as hoped, but should be more free from hereon out.

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
