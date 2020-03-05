import React, { useState } from "react"
import { Form, FormGroup, Label, Col, Input } from "reactstrap"
import { addGroceryItem } from "../../utility/api"

export const CreateGroceryItem: React.FC<any> = (props: any) => {
    const [name, setName] = useState("")
    const [price, setPrice] = useState(0)
    const [amount, setAmount] = useState(0)
    const [type, setType] = useState("")

    return(
        <>
         <div className="creation">
          <h1>Add Grocery Item</h1>
          <Form
            onSubmit={() =>
              addGroceryItem({
                  id: 0,
                  name: name,
                  price: price,
                  amount: amount,
                  type: type
              }) //.then((r:any) => console.log(r.data))
            }
          >
          <FormGroup row>
              <Label for="name" sm={4}>
                  Item Name
              </Label>
              <Col sm={8}>
                  <Input
                    required
                    type="text"
                    name="name"
                    placeholder="Grocery Name"
                    onChange={val => setName(val.target.value)}
                  />
              </Col>
              <Label for="price" sm={4}>
                  Item Price
              </Label>
              <Col sm={8}>
                  <Input
                    required
                    type="number"
                    name="price"
                    placeholder="Item Price"
                    onChange={val => setPrice(0)}
                  />
              </Col>
              <Label for="price" sm={4}>
                  Amount
              </Label>
              <Col sm={8}>
                  <Input
                    required
                    type="number"
                    name="amount"
                    placeholder="Amount"
                    onChange={val => setAmount(0)}
                  />
              </Col>
              <Label for="type" sm={4}>
                  Item Type
              </Label>
              <Col sm={8}>
                  <Input
                    required
                    type="text"
                    name="type"
                    placeholder="Item Type"
                    onChange={val => setType(val.target.value)}
                  />
              </Col>
          </FormGroup>

          </Form>
         </div>
        </>
    );
}

export default CreateGroceryItem