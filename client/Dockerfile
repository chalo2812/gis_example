FROM node:alpine
# replace this with your application's default port
RUN mkdir -p /opt
WORKDIR /opt
COPY package.json .
RUN npm install --quiet
COPY . .
EXPOSE 80
RUN npm run build
CMD ["npm","run","serve"]