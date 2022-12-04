#implent the creation of blockchain (Adding the blocks to the chain and validating)
import hashlib as hasher
import datetime as date

class Block:

    def __init__(self, index, timestamp, data, previous_hash):
        self.index = index
        self.timestamp = timestamp
        self.data = data
        self.previous_hash = previous_hash
        self.hash = self.hash_block()

    def __repr__(self):
        return "index %04d: \n Time %s, \n Data %s : \n Previous hash %s" % (self.index, str(self.timestamp), str(self.data), str(self.previous_hash))
    def hash_block(self):
        sha = hasher.sha256()
        sha.update(repr(self).encode('ascii'))
        return sha.hexdigest()

def create_genesis_block():
    return Block(0, date.datetime.now(), "Genesis Block", "0")
blockchain = [create_genesis_block()]
previous_block = blockchain[0]
blockchain

def next_block(last_block):
    this_index = last_block.index + 1
    this_timestamp = date.datetime.now()
    this_data = "Hey! I,m block " + str(this_index)
    this_hash = last_block.hash
    return Block(this_index, this_timestamp, this_data, this_hash)

num_of_block_to_add = 5

for i in range (0, num_of_block_to_add):
    block_to_add = next_block(previous_block)
    blockchain.append(block_to_add)
    previous_block = block_to_add
    print(repr(block_to_add))
    print(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")

def validate_blockchain(in_blockchain):
    for current_position in range(1, len(in_blockchain)):
        previous_position = current_position - 1
        if in_blockchain [previous_position].hash_block() == in_blockchain[current_position].previous_hash:
            print('Block %d is valid' % current_position)
        else:
            warn('Block %d is invalid! (%s)' % (current_position, repr(in_blockchain[current_position])))
            break

validate_blockchain(blockchain)
